package typingsSlinky.std.global

import org.scalajs.dom.experimental.ResponseInit
import typingsSlinky.std.BodyInit
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* This class was inferred from a value with a constructor. In rare cases (like HTMLElement in the DOM) it might not work as you expect. */
@JSGlobal("Response")
@js.native
class Response ()
  extends typingsSlinky.std.Response {
  def this(body: BodyInit) = this()
  def this(body: js.UndefOr[BodyInit], init: ResponseInit) = this()
  def this(body: Null, init: ResponseInit) = this()
}
object Response {
  
  @JSGlobal("Response.error")
  @js.native
  def error(): org.scalajs.dom.experimental.Response = js.native
  
  @JSGlobal("Response.redirect")
  @js.native
  def redirect(url: java.lang.String): org.scalajs.dom.experimental.Response = js.native
  @JSGlobal("Response.redirect")
  @js.native
  def redirect(url: java.lang.String, status: Double): org.scalajs.dom.experimental.Response = js.native
}
