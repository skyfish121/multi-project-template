-- Project Name : login_sample
-- Date/Time    : 2021/07/27 9:54:00
-- Author       : skyfi
-- RDBMS Type   : PostgreSQL
-- Application  : A5:SQL Mk-2

/*
  << 注意！！ >>
  BackupToTempTable, RestoreFromTempTable疑似命令が付加されています。
  これにより、drop table, create table 後もデータが残ります。
  この機能は一時的に $$TableName のような一時テーブルを作成します。
  この機能は A5:SQL Mk-2でのみ有効であることに注意してください。
*/

-- 予約管理
--* BackupToTempTable
DROP TABLE if exists reserve_mng CASCADE;

--* RestoreFromTempTable
CREATE TABLE reserve_mng (
  order_reserve_mng_id BIGSERIAL NOT NULL
  , start_date TIMESTAMP NOT NULL
  , end_date TIMESTAMP NOT NULL
  , mail_address VARCHAR(256) NOT NULL
  , title VARCHAR(64) NOT NULL
  , overview VARCHAR(1024) NOT NULL
  , create_date TIMESTAMP
  , create_id BIGINT
  , create_function VARCHAR(256)
  , update_date TIMESTAMP
  , update_id BIGINT
  , update_function VARCHAR(256)
  , CONSTRAINT reserve_mng_PKC PRIMARY KEY (order_reserve_mng_id)
) ;

-- ロール機能
--* BackupToTempTable
DROP TABLE if exists role_function CASCADE;

--* RestoreFromTempTable
CREATE TABLE role_function (
  role_function_id SERIAL NOT NULL
  , role_id INTEGER NOT NULL
  , function_id INTEGER NOT NULL
  , create_timestamp TIMESTAMP
  , create_id BIGINT
  , create_function VARCHAR(256)
  , update_timestamp TIMESTAMP
  , update_id BIGINT
  , update_function VARCHAR(256)
  , CONSTRAINT role_function_PKC PRIMARY KEY (role_function_id)
) ;

-- ユーザ情報
--* BackupToTempTable
DROP TABLE if exists user_info CASCADE;

--* RestoreFromTempTable
CREATE TABLE user_info (
  user_id BIGSERIAL NOT NULL
  , last_name VARCHAR(32) NOT NULL
  , first_name VARCHAR(32) NOT NULL
  , login_name VARCHAR(64) NOT NULL UNIQUE
  , password VARCHAR(256) NOT NULL
  , mail_address VARCHAR(256) NOT NULL UNIQUE
  , role_id INT NOT NULL
  , create_timestamp TIMESTAMP
  , create_id BIGINT
  , create_function VARCHAR(256)
  , update_timestamp TIMESTAMP
  , update_id BIGINT
  , update_function VARCHAR(256)
  , CONSTRAINT user_info_PKC PRIMARY KEY (user_id)
) ;

-- 機能情報
--* BackupToTempTable
DROP TABLE if exists function_info CASCADE;

--* RestoreFromTempTable
CREATE TABLE function_info (
  function_id SERIAL NOT NULL
  , function_name VARCHAR(36) NOT NULL
  , function_name_ja VARCHAR(36) NOT NULL
  , function_url VARCHAR(1000)
  , create_timestamp TIMESTAMP
  , create_id BIGINT
  , create_function VARCHAR(256)
  , update_timestamp TIMESTAMP
  , update_id BIGINT
  , update_function VARCHAR(256)
  , CONSTRAINT function_info_PKC PRIMARY KEY (function_id)
) ;

-- ロール情報
--* BackupToTempTable
DROP TABLE if exists role_info CASCADE;

--* RestoreFromTempTable
CREATE TABLE role_info (
  role_id SERIAL NOT NULL
  , role_name VARCHAR(32) NOT NULL
  , role_name_ja VARCHAR(32) NOT NULL
  , create_timestamp TIMESTAMP
  , create_id BIGINT
  , create_function VARCHAR(256)
  , update_timestamp TIMESTAMP
  , update_id BIGINT
  , update_function VARCHAR(256)
  , CONSTRAINT role_info_PKC PRIMARY KEY (role_id)
) ;

COMMENT ON TABLE reserve_mng IS '予約管理';
COMMENT ON COLUMN reserve_mng.order_reserve_mng_id IS '順番予約管理ID';
COMMENT ON COLUMN reserve_mng.start_date IS '開始日時';
COMMENT ON COLUMN reserve_mng.end_date IS '終了日時';
COMMENT ON COLUMN reserve_mng.mail_address IS 'メールアドレス';
COMMENT ON COLUMN reserve_mng.title IS '見出し';
COMMENT ON COLUMN reserve_mng.overview IS '概要';
COMMENT ON COLUMN reserve_mng.create_date IS '作成日時';
COMMENT ON COLUMN reserve_mng.create_id IS '作成ID';
COMMENT ON COLUMN reserve_mng.create_function IS '作成機能';
COMMENT ON COLUMN reserve_mng.update_date IS '更新日時';
COMMENT ON COLUMN reserve_mng.update_id IS '更新ID';
COMMENT ON COLUMN reserve_mng.update_function IS '更新機能';

COMMENT ON TABLE role_function IS 'ロール機能';
COMMENT ON COLUMN role_function.role_function_id IS 'ロール機能ID';
COMMENT ON COLUMN role_function.role_id IS 'ロールID';
COMMENT ON COLUMN role_function.function_id IS '機能ID';
COMMENT ON COLUMN role_function.create_timestamp IS '作成日時';
COMMENT ON COLUMN role_function.create_id IS '作成ID';
COMMENT ON COLUMN role_function.create_function IS '作成機能';
COMMENT ON COLUMN role_function.update_timestamp IS '更新日時';
COMMENT ON COLUMN role_function.update_id IS '更新ID';
COMMENT ON COLUMN role_function.update_function IS '更新機能';

COMMENT ON TABLE user_info IS 'ユーザ情報';
COMMENT ON COLUMN user_info.user_id IS 'ユーザID';
COMMENT ON COLUMN user_info.last_name IS '姓';
COMMENT ON COLUMN user_info.first_name IS '名';
COMMENT ON COLUMN user_info.login_name IS 'ログイン名';
COMMENT ON COLUMN user_info.password IS 'パスワード';
COMMENT ON COLUMN user_info.mail_address IS 'メールアドレス';
COMMENT ON COLUMN user_info.role_id IS 'ロールID';
COMMENT ON COLUMN user_info.create_timestamp IS '作成日時';
COMMENT ON COLUMN user_info.create_id IS '作成ID';
COMMENT ON COLUMN user_info.create_function IS '作成機能';
COMMENT ON COLUMN user_info.update_timestamp IS '更新日時';
COMMENT ON COLUMN user_info.update_id IS '更新ID';
COMMENT ON COLUMN user_info.update_function IS '更新機能';

COMMENT ON TABLE function_info IS '機能情報';
COMMENT ON COLUMN function_info.function_id IS '機能ID';
COMMENT ON COLUMN function_info.function_name IS '機能名';
COMMENT ON COLUMN function_info.function_name_ja IS '機能名(日本語)';
COMMENT ON COLUMN function_info.function_url IS '機能URL';
COMMENT ON COLUMN function_info.create_timestamp IS '作成日時';
COMMENT ON COLUMN function_info.create_id IS '作成ID';
COMMENT ON COLUMN function_info.create_function IS '作成機能';
COMMENT ON COLUMN function_info.update_timestamp IS '更新日時';
COMMENT ON COLUMN function_info.update_id IS '更新ID';
COMMENT ON COLUMN function_info.update_function IS '更新機能';

COMMENT ON TABLE role_info IS 'ロール情報';
COMMENT ON COLUMN role_info.role_id IS 'ロールID';
COMMENT ON COLUMN role_info.role_name IS 'ロール名';
COMMENT ON COLUMN role_info.role_name_ja IS 'ロール名(日本語)';
COMMENT ON COLUMN role_info.create_timestamp IS '作成日時';
COMMENT ON COLUMN role_info.create_id IS '作成ID';
COMMENT ON COLUMN role_info.create_function IS '作成機能';
COMMENT ON COLUMN role_info.update_timestamp IS '更新日時';
COMMENT ON COLUMN role_info.update_id IS '更新ID';
COMMENT ON COLUMN role_info.update_function IS '更新機能';

INSERT INTO USER_INFO(LAST_NAME, FIRST_NAME, LOGIN_NAME, PASSWORD, MAIL_ADDRESS, ROLE_ID) VALUES('姓姓姓１', '名名名１', 'admin', '$2a$08$iQZi6.4fFS61lahX8.dl0ee.E4/1W9PEnuZj3zixuQkGfLM3rJQTe', 'a@aa.aa', 1);
INSERT INTO USER_INFO(LAST_NAME, FIRST_NAME, LOGIN_NAME, PASSWORD, MAIL_ADDRESS, ROLE_ID) VALUES('姓姓姓２', '名名名２', 'user', '$2a$08$iQZi6.4fFS61lahX8.dl0ee.E4/1W9PEnuZj3zixuQkGfLM3rJQTe', 'b@bb.bb', 2);

INSERT INTO ROLE_INFO(role_id, role_name, role_name_ja) VALUES(1, 'admin', 'アドミン');
INSERT INTO ROLE_INFO(role_id, role_name, role_name_ja) VALUES(2, 'user', '通常');

INSERT INTO FUNCTION_INFO(function_id, function_name, function_name_ja) VALUES(1, 'ROLE_ADMIN', 'アドミン権限');
INSERT INTO FUNCTION_INFO(function_id, function_name, function_name_ja) VALUES(2, 'ROLE_USER', '通常権限');

INSERT INTO ROLE_FUNCTION(role_function_id, role_id, function_id) VALUES(1, 1, 1);
INSERT INTO ROLE_FUNCTION(role_function_id, role_id, function_id) VALUES(2, 1, 2);
INSERT INTO ROLE_FUNCTION(role_function_id, role_id, function_id) VALUES(3, 2, 2);