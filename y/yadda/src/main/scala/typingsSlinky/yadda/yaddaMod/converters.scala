package typingsSlinky.yadda.yaddaMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("yadda", "converters")
@js.native
object converters extends js.Object {
  @js.native
  object date extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = js.native
  }
  
  @js.native
  object float extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  }
  
  @js.native
  object integer extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  }
  
  @js.native
  object list extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  }
  
  @js.native
  object pass_through extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = js.native
  }
  
  @js.native
  object table extends js.Object {
    def apply(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  }
  
}

