package com.douglasulian.findmyappartment

import org.slf4j.LoggerFactory
import org.springframework.scheduling.annotation.Scheduled
import org.springframework.stereotype.Component
import java.text.SimpleDateFormat
import java.util.*

/*
 * Copyright 2012-2015 the original author or authors.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *	  https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

@Component
class ScheduledTask {
    @Scheduled(fixedRate = 5001)
    fun reportCurrentTime() {
        log.info("The time is now {}", dateFormat.format(Date()))
    }

    companion object {
        private val log = LoggerFactory.getLogger(ScheduledTask::class.java)
        private val dateFormat = SimpleDateFormat("HH:mm:ss")
    }
}