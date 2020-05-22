package typingsSlinky.vexflow.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Position extends js.Object {
  var position: js.UndefOr[typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions] = js.undefined
  var start: typingsSlinky.vexflow.Vex.Flow.Note
  var stop: typingsSlinky.vexflow.Vex.Flow.Note
  var superscript: js.UndefOr[String] = js.undefined
  var text: js.UndefOr[String] = js.undefined
}

object Position {
  @scala.inline
  def apply(
    start: typingsSlinky.vexflow.Vex.Flow.Note,
    stop: typingsSlinky.vexflow.Vex.Flow.Note,
    position: typingsSlinky.vexflow.Vex.Flow.TextBracket.Positions = null,
    superscript: String = null,
    text: String = null
  ): Position = {
    val __obj = js.Dynamic.literal(start = start.asInstanceOf[js.Any], stop = stop.asInstanceOf[js.Any])
    if (position != null) __obj.updateDynamic("position")(position.asInstanceOf[js.Any])
    if (superscript != null) __obj.updateDynamic("superscript")(superscript.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Position]
  }
}

