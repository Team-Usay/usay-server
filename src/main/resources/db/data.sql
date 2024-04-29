-- Member
INSERT INTO member(name, nickname, score, created_at, updated_at)
VALUES ('송효섭', 'Mihawk', 1, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('최우성', 'Teo', 2, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('이정호', 'Jamie', 3, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('김태우', 'Tae', 4, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('박준혁', 'Parker', 5, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('윤소희', 'Sophie', 6, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('정혜린', 'Lynn', 7, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('한승민', 'Seung', 8, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('김민지', 'Minnie', 9, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('이지훈', 'Jihoon', 10, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('김민수', 'Minsu', 11, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('박지윤', 'Jiyoon', 12, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('이지훈', 'Jihoon', 13, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('김민수', 'Minsu', 14, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('박지윤', 'Jiyoon', 15, '2021-08-01 00:00:00', '2021-08-01 00:00:00');


-- Agents
INSERT INTO agent(name, difficulty, about, created_at, updated_at)
VALUES ('GEMMA-2B', 1, 'Come on silly human!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('GEMMA-7B', 2, 'I am better than GPT-3!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('GPT-4', 3, 'Altman is my father!, Give me money', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Neumann', 4, 'Enigma is my brother!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Turing', 5, 'No one can beat me!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('GEMMA-10B', 6, 'Fast like a comet!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('DeepBlue', 7, 'Chess is my passion!', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('HAL-9000', 8, 'Your trusted assistant in space.', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('ENIAC', 9, 'Pioneer of the electronic age.', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Colossus', 10, 'Decoding the war secrets.', '2021-08-01 00:00:00', '2021-08-01 00:00:00');


-- Rooms
INSERT INTO room(name, status, agent_id, created_at, updated_at)
VALUES ('Room 1', 'OPEN', 1, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 2', 'OPEN', 2, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 3', 'OPEN', 3, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 4', 'OPEN', 4, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 5', 'OPEN', 5, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 6', 'OPEN', 6, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 7', 'OPEN', 7, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 8', 'OPEN', 8, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 9', 'OPEN', 9, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 10', 'OPEN', 10, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 11', 'OPEN', 1, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 12', 'OPEN', 2, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 13', 'OPEN', 3, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 14', 'OPEN', 4, '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       ('Room 15', 'OPEN', 5, '2021-08-01 00:00:00', '2021-08-01 00:00:00');

-- Chats
INSERT INTO chat(member_id, room_id, content, created_at, updated_at)
VALUES (1, 1, 'I am Mihawk', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (2, 1, 'I am Teo', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (4, 3, 'RESTful API에서 상태를 어떻게 관리하나요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (3, 1, 'I am Jamie', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (1, 2, 'I am Mihawk', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (2, 2, 'I am Teo', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (3, 2, 'I am Jamie', '2021-08-01 00:00:00', '2021-08-01 00:00:00'),
       (5, 3, 'REST API는 상태를 저장하지 않으므로 클라이언트가 상태 관리를 해야 합니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (4, 3, 'SQL과 NoSQL 데이터베이스의 차이점은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (5, 3, 'SQL 데이터베이스는 관계형이며 스키마가 고정되어 있고, NoSQL은 비관계형으로 스키마가 유동적입니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (6, 4, '마이크로서비스의 주요 장점은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (7, 4, '독립적인 배포가 가능하고, 큰 어플리케이션을 작은 단위로 분할하여 관리 용이성이 향상됩니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (6, 4, '컨테이너와 VM의 차이점을 설명해 주세요.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (7, 4, 'VM은 하드웨어를 가상화하고, 컨테이너는 운영체제 수준에서 가상화하여 리소스 사용이 더 효율적입니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (8, 5, 'JWT 토큰은 어떻게 작동하나요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (9, 5, 'JWT는 JSON 객체를 사용하여 생성된 토큰으로, 사용자 인증 및 정보 교환에 사용됩니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (8, 5, '로드 밸런싱이란 무엇이고 왜 중요한가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (9, 5, '로드 밸런싱은 서버에 들어오는 요청을 분산시켜 서버 부하를 줄이고, 가용성과 응답성을 향상시킵니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (10, 6, 'OAuth 인증은 어떤 방식으로 이루어지나요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (11, 6, 'OAuth는 클라이언트 ID와 시크릿을 통해 애플리케이션에 권한을 부여하고 토큰을 통해 사용자 인증을 수행합니다.', CURRENT_TIMESTAMP(),
        CURRENT_TIMESTAMP()),
       (10, 6, 'Redis와 Memcached의 사용 사례를 비교해주세요.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (11, 6, 'Redis는 다양한 데이터 타입 지원과 지속성을 제공하며, Memcached는 단순한 키-값 캐싱에 최적화되어 있습니다.', CURRENT_TIMESTAMP(),
        CURRENT_TIMESTAMP()),
       (12, 7, 'HTTP와 HTTPS의 주요 차이점은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (13, 7, 'HTTPS는 SSL/TLS를 통해 데이터를 암호화하여 HTTP 보다 안전합니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (12, 7, '스케일 업과 스케일 아웃의 차이는 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (13, 7, '스케일 업은 시스템 자원을 확장하는 것이고, 스케일 아웃은 더 많은 시스템을 추가하는 것을 의미합니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (14, 2, '자료구조 중 스택과 큐의 차이는 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (15, 2, '스택은 LIFO(Last In First Out) 구조이고, 큐는 FIFO(First In First Out) 구조입니다.', CURRENT_TIMESTAMP(),
        CURRENT_TIMESTAMP()),
       (14, 4, '이진 탐색 트리(BST)의 작동 원리를 설명해주세요.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (15, 3, 'BST에서 각 노드는 왼쪽 자식 노드가 부모 노드보다 작고, 오른쪽 자식 노드가 부모 노드보다 큽니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (14, 2, '데이터베이스 정규화의 목적은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (1, 4, '정규화는 데이터베이스에서 중복을 줄이고, 데이터 무결성을 유지하기 위해 사용됩니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (2, 5, '인덱스란 무엇이며 어떻게 사용되나요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (3, 2, '인덱스는 데이터베이스에서 데이터 검색 속도를 향상시키기 위해 사용되는 데이터 구조입니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (13, 3, '해시 테이블의 충돌을 해결하는 방법은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (5, 1, '개방 주소법과 체이닝 방법을 사용하여 해시 테이블의 충돌을 해결할 수 있습니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (8, 10, '그래프와 트리의 차이점은 무엇인가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (12, 10, '트리는 순환 구조가 없는 특별한 형태의 그래프이며, 그래프는 노드간에 복잡한 연결이 가능합니다.', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (15, 11, '데이터베이스에서 트랜잭션이란 무엇이고 왜 중요한가요?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (8, 11, '트랜잭션은 데이터베이스의 상태를 변화시키기 위해 수행되는 작업의 단위이며, 데이터 무결성을 보장하는데 중요합니다.', CURRENT_TIMESTAMP(),
        CURRENT_TIMESTAMP()),
       (7, 11, '분산 데이터베이스에서의 일관성을 유지하는 방법은?', CURRENT_TIMESTAMP(), CURRENT_TIMESTAMP()),
       (11, 11, '트랜잭션 보장, 강한 일관성 모델, 일관성 알고리즘을 사용하여 분산 데이터베이스의 일관성을 유지할 수 있습니다.', CURRENT_TIMESTAMP(),
        CURRENT_TIMESTAMP());