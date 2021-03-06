package zzb.datatype

import org.scalatest.{MustMatchers, WordSpec}
import spray.json.JsonParser

/**
 * Created by Simon on 2015/4/14 
 */
class DateTimeParseTest extends WordSpec with MustMatchers {

  "DateTimeType" must {
    "implicitly support multi-format " in {

      val json1 = "\"1999-11-22 20:22:13.001\""

      val fromJson1 = TDateTime.fromJsValue(JsonParser(json1))
      val d = 0

    }

    "Format" in {
      val s = "2015-05-08 00:00:00.888"
      val f = TDateTime.parse(s).value.toString("yyyy-MM-dd HH:mm:ss.SSS")
      println(f)
    }
  }

}
