-- Engineer --
INSERT INTO public.professions (id, created_at, enabled, description, exclusive_skill_limit, name, start_points,
                                base_sanity, base_fear, base_body, base_armor)
VALUES (1, '2022-09-25 18:05:25.000000', true,
        'Это суровая команда и рабочие в космосе. Если Рипли из "Чужого" твой герой, ты захочешь сыграть за Инженера.',
        1, 'Экипаж', 4, 30, 35, 30, 35);

INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (1, 6);
INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (1, 10);

INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (1, 8);
INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (1, 12);

INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (1, '2022-09-25 18:05:25.000000', 'STRENGTH', 5, null, 1);
INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (2, '2022-09-25 18:05:25.000000', 'SPEED', 5, null, 1);


-- Scientist --
INSERT INTO public.professions (id, created_at, enabled, description, exclusive_skill_limit, name, start_points,
                                base_sanity, base_fear, base_body, base_armor)
VALUES (2, '2022-09-25 18:05:25.000000', true,
        'Это доктора, исследователи и кто угодно, кто хочет вскрыть пришельцев (или инфецированных членов команды) скальпелем.',
        2, 'Ученый', 3, 40, 25, 25, 30);

INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (2, 2);
INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (2, 4);
INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (2, 9);
INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (2, 13);
INSERT INTO public.profession_exclusive_skills (profession_id, skill_id) VALUES (2, 20);

INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (3, '2022-09-25 18:05:25.000000', 'INTELLECT', 10, null, 2);

-- Android --
INSERT INTO public.professions (id, created_at, enabled, description, exclusive_skill_limit, name, start_points,
                                base_sanity, base_fear, base_body, base_armor)
VALUES (3, '2022-09-25 18:05:25.000000', true,
        'Это ужасающее и волнующее дополнение любой команды. Они пугают всю команду своей холодной бесчеловечностью.',
        0, 'Андроид', 2, 20, 85, 40, 25);

INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (3, 9);
INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (3, 13);
INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (3, 1);

INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (4, '2022-09-25 18:05:25.000000', 'INTELLECT', 5, null, 3);
INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (5, '2022-09-25 18:05:25.000000', 'SPEED', 5, null, 3);

-- Marine --
INSERT INTO public.professions (id, created_at, enabled, description, exclusive_skill_limit, name, start_points,
                                base_sanity, base_fear, base_body, base_armor)
VALUES (4, '2022-09-25 18:05:25.000000', true,
        'Они здесь для того, чтобы стрелять в жуков и жевать жевачку. Они полезны в бою и хороши вместе, но когда Пехотинец паникует, проблем прибавляется остальной команде',
        0, 'Пехотинец', 3, 25, 30, 35, 40);

INSERT INTO public.profession_assigned_skills (profession_id, skill_id) VALUES (4, 17);

INSERT INTO public.profession_bonus (id, created_at, bonus_for, bonus_value, special_rules, profession_id) VALUES (6, '2022-09-25 18:05:25.000000', 'COMBAT', 5, '+5 когда рядом дружественный морпех', 4);
