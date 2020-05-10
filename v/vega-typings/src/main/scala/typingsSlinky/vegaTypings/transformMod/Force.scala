package typingsSlinky.vegaTypings.transformMod

import typingsSlinky.vegaTypings.vegaTypingsStrings.center
import typingsSlinky.vegaTypings.vegaTypingsStrings.collide
import typingsSlinky.vegaTypings.vegaTypingsStrings.link
import typingsSlinky.vegaTypings.vegaTypingsStrings.nbody
import typingsSlinky.vegaTypings.vegaTypingsStrings.x
import typingsSlinky.vegaTypings.vegaTypingsStrings.y
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.transformMod.ForceCenter
  - typingsSlinky.vegaTypings.transformMod.ForceCollide
  - typingsSlinky.vegaTypings.transformMod.ForceLink
  - typingsSlinky.vegaTypings.transformMod.ForceNBody
  - typingsSlinky.vegaTypings.transformMod.ForceX
  - typingsSlinky.vegaTypings.transformMod.ForceY
*/
trait Force extends js.Object

object Force {
  @scala.inline
  def ForceCollide(force: collide): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceNBody(force: nbody): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceX(force: x): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceY(force: y): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceCenter(force: center): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
  @scala.inline
  def ForceLink(force: link): Force = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[Force]
  }
}

