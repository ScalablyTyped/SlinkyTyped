package typingsSlinky.vizJs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Viz extends StObject {
  
  def renderString(src: String): js.Promise[String] = js.native
  def renderString(src: String, options: Options): js.Promise[String] = js.native
}
