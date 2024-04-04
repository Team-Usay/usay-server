-- Member
INSERT INTO member(name, nickname, score)
VALUES ('송효섭', 'Mihawk', 1),
       ('최우성', 'Teo', 2),
       ('이정호', 'Jamie', 3);

-- Agents
INSERT INTO agent(name, difficulty, about)
VALUES ('GEMMA-2B', 1, 'Come on silly human!'),
       ('GEMMA-7B', 2, 'I am better than GPT-3!'),
       ('GPT-4', 3, 'Altman is my father!, Give me money'),
       ('Neumann', 4, 'Enigma is my brother!'),
       ('Turing', 5, 'No one can beat me!');


-- Rooms
INSERT INTO room(name, status, agent_id)
VALUES ('Room 1', 'OPEN', 1),
       ('Room 2', 'CLOSE', 2);

-- Chats
INSERT INTO chat(member_id, room_id, content)
VALUES (1, 1, 'I am Mihawk'),
       (2, 1, 'I am Teo'),
       (3, 1, 'I am Jamie'),
       (1, 2, 'I am Mihawk'),
       (2, 2, 'I am Teo'),
       (3, 2, 'I am Jamie');