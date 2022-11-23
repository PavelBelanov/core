CREATE TABLE `rubelanov`.`users`
(
    `id`       BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `email`    VARCHAR(45) NOT NULL,
    `password` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `email_UNIQUE` (`email` ASC) VISIBLE
);


INSERT INTO `rubelanov`.`users` (`email`, `password`)
VALUES ('show@gmail.com', '1password1');

CREATE TABLE `rubelanov`.`roles`
(
    `id`   BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `name` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `name_UNIQUE` (`name` ASC) VISIBLE
);


CREATE TABLE `rubelanov`.`users-roles`
(
    `user_id` BIGINT(20) NOT NULL,
    `role_id` BIGINT(20) NOT NULL,
    INDEX `fk_userid_idx` (`user_id` ASC) VISIBLE,
    INDEX `fk_roles_idx` (`role_id` ASC) VISIBLE,
    CONSTRAINT `fk_users`
        FOREIGN KEY (`user_id`)
            REFERENCES `rubelanov`.`users` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_roles`
        FOREIGN KEY (`role_id`)
            REFERENCES `rubelanov`.`roles` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

INSERT INTO `rubelanov`.`roles` (`name`)
VALUES ('USER');
INSERT INTO `rubelanov`.`roles` (`name`)
VALUES ('MANAGER');
INSERT INTO `rubelanov`.`roles` (`name`)
VALUES ('ADMIN');
INSERT INTO `rubelanov`.`users-roles` (`user_id`, `role_id`)
VALUES ('1', '1');


CREATE TABLE `rubelanov`.`en_word`
(
    `id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `meaning` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE
);

CREATE TABLE `rubelanov`.`ru_words`
(
    `id`      BIGINT(20)  NOT NULL AUTO_INCREMENT,
    `meaning` VARCHAR(45) NOT NULL,
    PRIMARY KEY (`id`),
    UNIQUE INDEX `meaning_UNIQUE` (`meaning` ASC) VISIBLE
);

CREATE TABLE `rubelanov`.`cards`
(
    `id`         BIGINT(20) NOT NULL AUTO_INCREMENT,
    `en_word_id` BIGINT(20) NOT NULL,
    `ru_word_id` BIGINT(20) NOT NULL,
    `rating`     BIGINT(20) NULL,
    PRIMARY KEY (`id`),
    INDEX `fk_en_word_idx` (`en_word_id` ASC) VISIBLE,
    INDEX `fk_ru_word_idx` (`ru_word_id` ASC) VISIBLE,
    CONSTRAINT `fk_en_word`
        FOREIGN KEY (`en_word_id`)
            REFERENCES `rubelanov`.`en_word` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION,
    CONSTRAINT `fk_ru_word`
        FOREIGN KEY (`ru_word_id`)
            REFERENCES `rubelanov`.`ru_words` (`id`)
            ON DELETE NO ACTION
            ON UPDATE NO ACTION
);

INSERT INTO `rubelanov`.`en_word` (`meaning`) VALUES ('Hello');
INSERT INTO `rubelanov`.`ru_words` (`meaning`) VALUES ('Привет');
INSERT INTO `rubelanov`.`cards` (`en_word_id`,`ru_word_id`, `rating`) VALUES ('1','1','5');
