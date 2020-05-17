package typingsSlinky.tabulatorTables.Tabulator

import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.plaintext
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.textarea
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.html
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.money
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.image
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetime
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetimediff
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.link
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.tickCross
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.color
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.star
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.traffic
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.progress
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.lookup
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonTick
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonCross
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rownum
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.handle
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowSelection
  - typingsSlinky.tabulatorTables.tabulatorTablesStrings.responsiveCollapse
  - js.Function3[
/ * cell * / typingsSlinky.tabulatorTables.Tabulator.CellComponent, 
/ * formatterParams * / js.Object, 
/ * onRendered * / typingsSlinky.tabulatorTables.Tabulator.EmptyCallback, 
java.lang.String | typingsSlinky.std.HTMLElement]
*/
trait Formatter extends js.Object

object Formatter {
  @scala.inline
  def plaintext: typingsSlinky.tabulatorTables.tabulatorTablesStrings.plaintext = "plaintext".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.plaintext]
  @scala.inline
  def textarea: typingsSlinky.tabulatorTables.tabulatorTablesStrings.textarea = "textarea".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.textarea]
  @scala.inline
  def html: typingsSlinky.tabulatorTables.tabulatorTablesStrings.html = "html".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.html]
  @scala.inline
  def money: typingsSlinky.tabulatorTables.tabulatorTablesStrings.money = "money".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.money]
  @scala.inline
  def image: typingsSlinky.tabulatorTables.tabulatorTablesStrings.image = "image".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.image]
  @scala.inline
  def datetime: typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetime = "datetime".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetime]
  @scala.inline
  def datetimediff: typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetimediff = "datetimediff".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.datetimediff]
  @scala.inline
  def link: typingsSlinky.tabulatorTables.tabulatorTablesStrings.link = "link".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.link]
  @scala.inline
  def tickCross: typingsSlinky.tabulatorTables.tabulatorTablesStrings.tickCross = "tickCross".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.tickCross]
  @scala.inline
  def color: typingsSlinky.tabulatorTables.tabulatorTablesStrings.color = "color".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.color]
  @scala.inline
  def star: typingsSlinky.tabulatorTables.tabulatorTablesStrings.star = "star".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.star]
  @scala.inline
  def traffic: typingsSlinky.tabulatorTables.tabulatorTablesStrings.traffic = "traffic".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.traffic]
  @scala.inline
  def progress: typingsSlinky.tabulatorTables.tabulatorTablesStrings.progress = "progress".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.progress]
  @scala.inline
  def lookup: typingsSlinky.tabulatorTables.tabulatorTablesStrings.lookup = "lookup".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.lookup]
  @scala.inline
  def buttonTick: typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonTick = "buttonTick".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonTick]
  @scala.inline
  def buttonCross: typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonCross = "buttonCross".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.buttonCross]
  @scala.inline
  def rownum: typingsSlinky.tabulatorTables.tabulatorTablesStrings.rownum = "rownum".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.rownum]
  @scala.inline
  def handle: typingsSlinky.tabulatorTables.tabulatorTablesStrings.handle = "handle".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.handle]
  @scala.inline
  def rowSelection: typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowSelection = "rowSelection".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.rowSelection]
  @scala.inline
  def responsiveCollapse: typingsSlinky.tabulatorTables.tabulatorTablesStrings.responsiveCollapse = "responsiveCollapse".asInstanceOf[typingsSlinky.tabulatorTables.tabulatorTablesStrings.responsiveCollapse]
  @scala.inline
  implicit def apply(
    value: js.Function3[
      /* cell */ CellComponent, 
      /* formatterParams */ js.Object, 
      /* onRendered */ EmptyCallback, 
      String | HTMLElement
    ]
  ): Formatter = value.asInstanceOf[Formatter]
}

