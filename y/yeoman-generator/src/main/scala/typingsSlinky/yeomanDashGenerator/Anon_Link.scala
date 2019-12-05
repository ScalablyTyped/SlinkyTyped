package typingsSlinky.yeomanDashGenerator

import typingsSlinky.yeomanDashGenerator.yeomanDashGeneratorStrings.strong
import typingsSlinky.yeomanDashGenerator.yeomanDashGeneratorStrings.weak
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Link extends js.Object {
  var link: weak | strong
  var local: String
}

object Anon_Link {
  @scala.inline
  def apply(link: weak | strong, local: String): Anon_Link = {
    val __obj = js.Dynamic.literal(link = link.asInstanceOf[js.Any], local = local.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[Anon_Link]
  }
}

