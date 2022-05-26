package com.lyjguy.kotest.springkotlinkotest

import io.kotest.assertions.throwables.shouldThrow
import io.kotest.core.spec.style.AnnotationSpec
import io.kotest.core.spec.style.FunSpec
import io.kotest.core.spec.style.StringSpec
import io.kotest.matchers.should
import io.kotest.matchers.shouldBe
import org.junit.jupiter.api.Test
import org.springframework.boot.context.properties.bind.Bindable.listOf

class SampleTest : StringSpec({
    "length should return size of string" {
        "hello".length shouldBe 5
    }
})

class MyTests : FunSpec({
    test("String length should return the length of the string") {
        "sammy".length shouldBe 5
        "".length shouldBe 0
    }
})