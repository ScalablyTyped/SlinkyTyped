package typingsSlinky.vexflow.global.Vex.Flow

import typingsSlinky.vexflow.Vex.IRenderContext
import typingsSlinky.vexflow.anon.Alignrests
import typingsSlinky.vexflow.anon.MaxIterations
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Vex.Flow.Formatter")
@js.native
class Formatter ()
  extends typingsSlinky.vexflow.Vex.Flow.Formatter {
  def this(options: MaxIterations) = this()
}

/* static members */
@JSGlobal("Vex.Flow.Formatter")
@js.native
object Formatter extends js.Object {
  var DEBUG: Boolean = js.native
  def AlignRestsToNotes(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]): typingsSlinky.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    align_all_notes: js.UndefOr[scala.Nothing],
    align_tuplets: Boolean
  ): typingsSlinky.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note], align_all_notes: Boolean): typingsSlinky.vexflow.Vex.Flow.Formatter = js.native
  def AlignRestsToNotes(
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    align_all_notes: Boolean,
    align_tuplets: Boolean
  ): typingsSlinky.vexflow.Vex.Flow.Formatter = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]
  ): typingsSlinky.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    params: Boolean
  ): typingsSlinky.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDraw(
    ctx: IRenderContext,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    params: Alignrests
  ): typingsSlinky.vexflow.Vex.Flow.BoundingBox = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note]
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    autobeam: js.UndefOr[scala.Nothing],
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    autobeam: js.UndefOr[scala.Nothing],
    params: Alignrests
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    autobeam: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Boolean
  ): Unit = js.native
  def FormatAndDrawTab(
    ctx: IRenderContext,
    tabstave: typingsSlinky.vexflow.Vex.Flow.TabStave,
    stave: typingsSlinky.vexflow.Vex.Flow.Stave,
    tabnotes: js.Array[typingsSlinky.vexflow.Vex.Flow.TabNote],
    notes: js.Array[typingsSlinky.vexflow.Vex.Flow.Note],
    autobeam: Boolean,
    params: Alignrests
  ): Unit = js.native
}

