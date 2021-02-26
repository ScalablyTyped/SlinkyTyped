package typingsSlinky.std.global

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("URL")
@js.native
class URL protected ()
  extends typingsSlinky.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.experimental.URL) = this()
}
object URL {
  
  @JSGlobal("URL.createObjectURL")
  @js.native
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  
  @JSGlobal("URL.revokeObjectURL")
  @js.native
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}
