-- Users
INSERT INTO users(name, nickname, score, role, email, profile_url, provider, provider_id) VALUES
('John Doe', 'johndoe', 100, 'user', 'johndoe@example.com', 'http://example.com/johndoe', 'github', '1'),
('Jane Doe', 'janedoe', 200, 'user', 'janedoe@example.com', 'http://example.com/janedoe', 'github', '2');

-- Agents
INSERT INTO agent(name, difficulty, about) VALUES
('Agent 1', 1, 'This is Agent 1'),
('Agent 2', 2, 'This is Agent 2');

-- Rooms
INSERT INTO room(agent_id, name, opener_id, status, prompt) VALUES
(1, 'Room 1', 1, 'open', 'This is the prompt for Room 1'),
(2, 'Room 2', 2, 'open', 'This is the prompt for Room 2');

-- Chats
INSERT INTO chat(user_id, room_id, content) VALUES
(1, 1, 'Hello, this is John Doe'),
(2, 2, 'Hello, this is Jane Doe');