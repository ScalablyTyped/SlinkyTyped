package typingsSlinky.yadda

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object convertersMod {
  
  @JSImport("yadda/lib/converters", "date")
  @js.native
  def date(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Date, Unit]): Unit = js.native
  
  @JSImport("yadda/lib/converters", "float")
  @js.native
  def float(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  
  @JSImport("yadda/lib/converters", "integer")
  @js.native
  def integer(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ Double, Unit]): Unit = js.native
  
  @JSImport("yadda/lib/converters", "list")
  @js.native
  def list(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
  
  @JSImport("yadda/lib/converters", "pass_through")
  @js.native
  def passThrough(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ String, Unit]): Unit = js.native
  
  @JSImport("yadda/lib/converters", "table")
  @js.native
  def table(value: String, next: js.Function2[/* err */ js.Error | Null, /* value */ js.Array[String], Unit]): Unit = js.native
}
