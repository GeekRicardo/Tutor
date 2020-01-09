### 公告：
	`notice`
	> `notice_id`,`title`,`type`,`time`, `content`
---
### 公告类别：
	`noticetype`:
	`ntype_id`, `title`
---

### 教师：
	table: `teacher`
	> `teacher_id`, `tea_name`, `passwd`, `sex`, `age`, `tel`, `address`, `subject`, `grade`, `education`(身份), `introduce`, `photosrc`
---

### 家长：
	`parents`:
	> `parents_id`, `par_name`, `passwd`, `tel`, `address`
---
### 科目：
	`subject`:
	> `sub_id`, `sub_name`

### 学员：
	`student`:
	> `stu_id`,`stu_name`, `passwd`, `sex`, `birthday`, `age`, `tel`, `address`, `parents_id`, `subject`, `situation`, `require`

---

### 预约：
	`order`:
	> `order_id`, `sponsor_id`(发起预约人), `user_id`(家长或学员), `sub_id`(预约科目), `makeordertime`(下单时间), `ordertime`（预约时间）, `status`
---

### 管理员：
	`root`:
	`id`, `username`, `passwd`, `level`

