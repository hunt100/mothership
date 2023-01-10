create table backpack
(
    id         int8 generated by default as identity,
    created_at timestamp,
    primary key (id)
);
create table backpack_items
(
    backpack_id int8 not null,
    item_id     int8 not null,
    primary key (backpack_id, item_id)
);
create table items
(
    type             varchar(31) not null,
    id               int8 generated by default as identity,
    created_at       timestamp,
    cost             numeric(5, 1),
    description      varchar(255),
    name             varchar(255),
    additional_armor int4,
    special_effects  varchar(255),
    ammunition       int4,
    critical_effect  varchar(255),
    multiplier       int4,
    roll_type        int4,
    special          varchar(255),
    primary key (id)
);
create table level_up_skills
(
    level_up_id int8 not null,
    skill_id    int8 not null,
    primary key (level_up_id, skill_id)
);
create table level_up
(
    id               int8 generated by default as identity,
    created_at       timestamp,
    add_resolve      boolean not null,
    heall_all_stress boolean not null,
    remove_phobia    boolean not null,
    skill_points     int4,
    upgrade_field_id int8,
    character_id     int8,
    primary key (id)
);
create table mercenary_skills
(
    mercenary_id int8 not null,
    skill_id     int8 not null,
    primary key (mercenary_id, skill_id)
);
create table npcs
(
    type                    varchar(31) not null,
    id                      int8 generated by default as identity,
    created_at              timestamp,
    enabled                 boolean,
    description             varchar(255),
    name                    varchar(255),
    combat                  numeric(5, 1),
    hits                    int4,
    instinct                numeric(5, 1),
    advance                 numeric(5, 1),
    job                     varchar(255),
    loyalty_dice_multiplier int4,
    salary                  numeric(5, 1),
    attack                  int4,
    hp                      numeric(5, 1),
    backpack_id             int8,
    primary key (id)
);
create table players
(
    id             int8 generated by default as identity,
    created_at     timestamp,
    enabled        boolean,
    description    varchar(255),
    name           varchar(255),
    avatar_url     varchar(255),
    combat         int4,
    credits        numeric(5, 1),
    current_health int4,
    intellect      int4,
    max_health     int4,
    rank           varchar(255),
    resolve        int4,
    speed          int4,
    strength       int4,
    stress         int4,
    xp             int4,
    backpack_id    int8,
    profession_id  int8,
    primary key (id)
);
create table profession_assigned_skills
(
    profession_id int8 not null,
    skill_id      int8 not null,
    primary key (profession_id, skill_id)
);
create table profession_exclusive_skills
(
    profession_id int8 not null,
    skill_id      int8 not null,
    primary key (profession_id, skill_id)
);
create table profession_bonus
(
    id            int8 generated by default as identity,
    created_at    timestamp,
    bonus_for     varchar(255),
    bonus_value   int4,
    special_rules varchar(255),
    profession_id int8,
    primary key (id)
);
create table professions
(
    id                    int8 generated by default as identity,
    created_at            timestamp,
    enabled               boolean,
    description           varchar(255),
    exclusive_skill_limit int4,
    name                  varchar(255),
    start_points          int4,
    primary key (id)
);
create table skill_dependencies
(
    id            int8 generated by default as identity,
    created_at    timestamp,
    depends_on_id int8,
    main_skill_id int8,
    primary key (id)
);
create table skills
(
    id                int8 generated by default as identity,
    created_at        timestamp,
    enabled           boolean,
    bonus_percent     numeric(5, 1),
    cost              int4,
    level             varchar(255),
    name              varchar(255),
    short_description TEXT,
    primary key (id)
);
create table special_abilities
(
    id           int8 generated by default as identity,
    created_at   timestamp,
    description  varchar(255),
    name         varchar(255),
    character_id int8,
    primary key (id)
);
create table upgrade_fields
(
    type         varchar(31) not null,
    id           int8 generated by default as identity,
    created_at   timestamp,
    first        int4,
    first_value  int4,
    second       varchar(255),
    second_value int4,
    value        int4,
    primary key (id)
);
alter table if exists backpack_items
    add constraint UK_2jnh5knjqfedsmk5rmg0vhgog unique (item_id);
alter table if exists level_up_skills
    add constraint UK_qnsthjdbcd9qq3cll43ylx2rd unique (skill_id);
alter table if exists mercenary_skills
    add constraint UK_7w1nuhmr0upcf013leq6tqro6 unique (skill_id);
alter table if exists profession_assigned_skills
    add constraint UK_lhe5knp6sxg1avg8xb2071x8w unique (skill_id);
alter table if exists profession_exclusive_skills
    add constraint UK_nxkg0yh41beiitu2n0a2ww8ux unique (skill_id);
alter table if exists backpack_items
    add constraint FK4l35u8r9433t6sqsli69ykmlr foreign key (item_id) references items;
alter table if exists backpack_items
    add constraint FK1wys3it83w4gvcw7rh80sjqm foreign key (backpack_id) references backpack;
alter table if exists level_up_skills
    add constraint FKbhccrhsvophfsj5xsculbud2f foreign key (skill_id) references skills;
alter table if exists level_up_skills
    add constraint FK4fk496776eu0mohquh0sic8pl foreign key (level_up_id) references level_up;
alter table if exists level_up
    add constraint FKmdxonue7nj59fbu55h63xa429 foreign key (upgrade_field_id) references upgrade_fields;
alter table if exists level_up
    add constraint FKi1aaj3uh3cu3xbfcxjo0ymdha foreign key (character_id) references players;
alter table if exists mercenary_skills
    add constraint FK96ri7qmrugeeg4x795vxngenu foreign key (skill_id) references skills;
alter table if exists mercenary_skills
    add constraint FKckfpcynvit4j5qxidsb1tytmm foreign key (mercenary_id) references npcs;
alter table if exists npcs
    add constraint FKq6ashf652f9e87g00v3oiqwsk foreign key (backpack_id) references backpack;
alter table if exists players
    add constraint FKi2xwc0uu5v6g1nhmdy8w83swl foreign key (backpack_id) references backpack;
alter table if exists players
    add constraint FK69f2shw5vxncg6ltt7x8dbfoq foreign key (profession_id) references professions;
alter table if exists profession_assigned_skills
    add constraint FKjyrat6fys16vdh639rtwiix2g foreign key (skill_id) references skills;
alter table if exists profession_assigned_skills
    add constraint FKh4ipkcnmhopuovaawt3i610k6 foreign key (profession_id) references professions;
alter table if exists profession_exclusive_skills
    add constraint FKb8ebnr0aycw8qpcige6t7x8w7 foreign key (skill_id) references skills;
alter table if exists profession_exclusive_skills
    add constraint FK6mowipax91c0cqi8yy3jga6cn foreign key (profession_id) references professions;
alter table if exists profession_bonus
    add constraint FKsjo8a0rpobc3ned9dxo6uskcc foreign key (profession_id) references professions;
alter table if exists skill_dependencies
    add constraint FKsk32yaxef6873knblawra60gq foreign key (depends_on_id) references skills;
alter table if exists skill_dependencies
    add constraint FKla7f048ss5q1ox40063kdl4le foreign key (main_skill_id) references skills;
alter table if exists special_abilities
    add constraint FKc195r8tn7v6jj3ui7ye3kpk1w foreign key (character_id) references npcs;