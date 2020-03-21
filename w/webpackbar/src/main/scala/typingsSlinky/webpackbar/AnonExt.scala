package typingsSlinky.webpackbar

import typingsSlinky.webpackbar.mod.Stats
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonExt extends js.Object {
  var ext: Stats
  var loader: Stats
}

object AnonExt {
  @scala.inline
  def apply(ext: Stats, loader: Stats): AnonExt = {
    val __obj = js.Dynamic.literal(ext = ext.asInstanceOf[js.Any], loader = loader.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonExt]
  }
}

