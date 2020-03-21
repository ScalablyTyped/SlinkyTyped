package typingsSlinky.vscode

import typingsSlinky.vscode.mod.Uri
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonLight extends js.Object {
  var dark: Uri
  var light: Uri
}

object AnonLight {
  @scala.inline
  def apply(dark: Uri, light: Uri): AnonLight = {
    val __obj = js.Dynamic.literal(dark = dark.asInstanceOf[js.Any], light = light.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonLight]
  }
}

