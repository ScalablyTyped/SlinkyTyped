package typingsSlinky.vegaTypings.rendererMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.vegaTypings.vegaTypingsStrings.canvas
  - typingsSlinky.vegaTypings.vegaTypingsStrings.svg
  - typingsSlinky.vegaTypings.vegaTypingsStrings.none
*/
trait Renderers extends js.Object

object Renderers {
  @scala.inline
  def canvas: typingsSlinky.vegaTypings.vegaTypingsStrings.canvas = this.cast("canvas")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def none: typingsSlinky.vegaTypings.vegaTypingsStrings.none = this.cast("none")
  @scala.inline
  def svg: typingsSlinky.vegaTypings.vegaTypingsStrings.svg = this.cast("svg")
}

