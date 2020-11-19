package typingsSlinky.std.global

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.Instantiable2
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSGlobal("webkitURL")
@js.native
class webkitURL protected ()
  extends typingsSlinky.std.URL {
  def this(url: java.lang.String) = this()
  def this(url: java.lang.String, base: java.lang.String) = this()
  def this(url: java.lang.String, base: org.scalajs.dom.experimental.URL) = this()
}
@JSGlobal("webkitURL")
@js.native
object webkitURL
  extends Instantiable1[/* url */ java.lang.String, org.scalajs.dom.experimental.URL]
     with Instantiable2[
      /* url */ java.lang.String, 
      (/* base */ java.lang.String) | (/* base */ org.scalajs.dom.experimental.URL), 
      org.scalajs.dom.experimental.URL
    ] {
  
  def createObjectURL(`object`: js.Any): java.lang.String = js.native
  
  def revokeObjectURL(url: java.lang.String): Unit = js.native
}
