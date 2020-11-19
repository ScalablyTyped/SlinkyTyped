package typingsSlinky.xhr.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait XhrInstance extends js.Object {
  
  def apply(options: XhrUriConfig, callback: XhrCallback): js.Any = js.native
  def apply(options: XhrUrlConfig, callback: XhrCallback): js.Any = js.native
  def apply(url: String, callback: XhrCallback): js.Any = js.native
  def apply(url: String, options: XhrBaseConfig, callback: XhrCallback): js.Any = js.native
}
