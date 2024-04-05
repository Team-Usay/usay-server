CREATE TABLE member
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(255) NOT NULL,
    nickname   VARCHAR(255) NOT NULL,
    score      INT       DEFAULT 0,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE agent
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    name       VARCHAR(255) NOT NULL,
    difficulty INT                   DEFAULT 0,
    about      TEXT         NOT NULL DEFAULT '',
    created_at TIMESTAMP             DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP             DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE room
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    member_id  BIGINT,
    agent_id   BIGINT,
    name       VARCHAR(255) NOT NULL,
    status     ENUM ('OPEN', 'CLOSE') DEFAULT 'OPEN',
    created_at TIMESTAMP              DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP              DEFAULT CURRENT_TIMESTAMP
);

CREATE TABLE chat
(
    id         BIGINT PRIMARY KEY AUTO_INCREMENT,
    member_id  BIGINT,
    room_id    BIGINT,
    content    TEXT,
    created_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP,
    updated_at TIMESTAMP DEFAULT CURRENT_TIMESTAMP
);
