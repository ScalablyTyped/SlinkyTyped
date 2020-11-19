package typingsSlinky.unzipper.mod

import typingsSlinky.node.Buffer
import typingsSlinky.node.streamMod.Transform
import typingsSlinky.unzipper.anon.CompressedSize
import typingsSlinky.unzipper.anon.Disknum
import typingsSlinky.unzipper.anon.Path
import typingsSlinky.unzipper.anon.TransformpromisePromisevo
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Entry extends Transform {
  
  def autodrain(): TransformpromisePromisevo = js.native
  
  def buffer(): js.Promise[Buffer] = js.native
  
  var extra: Disknum = js.native
  
  var path: String = js.native
  
  var props: Path = js.native
  
  var `type`: String = js.native
  
  var vars: CompressedSize = js.native
}
