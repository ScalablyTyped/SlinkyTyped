package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Provides special properties and methods (beyond the regular HTMLElement object interface it also has available to it by inheritance) for manipulating the layout and presentation of tables in an HTML document. */
@js.native
trait HTMLTableElement extends HTMLElement {
  /**
    * Sets or retrieves a value that indicates the table alignment.
    */
  /** @deprecated */
  var align: java.lang.String = js.native
  /** @deprecated */
  var bgColor: java.lang.String = js.native
  /**
    * Sets or retrieves the width of the border to draw around the object.
    */
  /** @deprecated */
  var border: java.lang.String = js.native
  /**
    * Retrieves the caption object of a table.
    */
  var caption: org.scalajs.dom.raw.HTMLTableCaptionElement | Null = js.native
  /**
    * Sets or retrieves the amount of space between the border of the cell and the content of the cell.
    */
  /** @deprecated */
  var cellPadding: java.lang.String = js.native
  /**
    * Sets or retrieves the amount of space between cells in a table.
    */
  /** @deprecated */
  var cellSpacing: java.lang.String = js.native
  /**
    * Sets or retrieves the way the border frame around the table is displayed.
    */
  /** @deprecated */
  var frame: java.lang.String = js.native
  /**
    * Sets or retrieves the number of horizontal rows contained in the object.
    */
  val rows: HTMLCollectionOf[org.scalajs.dom.raw.HTMLTableRowElement] = js.native
  /**
    * Sets or retrieves which dividing lines (inner borders) are displayed.
    */
  /** @deprecated */
  var rules: java.lang.String = js.native
  /**
    * Sets or retrieves a description and/or structure of the object.
    */
  /** @deprecated */
  var summary: java.lang.String = js.native
  /**
    * Retrieves a collection of all tBody objects in the table. Objects in this collection are in source order.
    */
  val tBodies: HTMLCollectionOf[org.scalajs.dom.raw.HTMLTableSectionElement] = js.native
  /**
    * Retrieves the tFoot object of the table.
    */
  var tFoot: org.scalajs.dom.raw.HTMLTableSectionElement | Null = js.native
  /**
    * Retrieves the tHead object of the table.
    */
  var tHead: org.scalajs.dom.raw.HTMLTableSectionElement | Null = js.native
  /**
    * Sets or retrieves the width of the object.
    */
  /** @deprecated */
  var width: java.lang.String = js.native
  /**
    * Creates an empty caption element in the table.
    */
  def createCaption(): org.scalajs.dom.raw.HTMLTableCaptionElement = js.native
  /**
    * Creates an empty tBody element in the table.
    */
  def createTBody(): org.scalajs.dom.raw.HTMLTableSectionElement = js.native
  /**
    * Creates an empty tFoot element in the table.
    */
  def createTFoot(): org.scalajs.dom.raw.HTMLTableSectionElement = js.native
  /**
    * Returns the tHead element object if successful, or null otherwise.
    */
  def createTHead(): org.scalajs.dom.raw.HTMLTableSectionElement = js.native
  /**
    * Deletes the caption element and its contents from the table.
    */
  def deleteCaption(): Unit = js.native
  /**
    * Removes the specified row (tr) from the element and from the rows collection.
    * @param index Number that specifies the zero-based position in the rows collection of the row to remove.
    */
  def deleteRow(index: Double): Unit = js.native
  /**
    * Deletes the tFoot element and its contents from the table.
    */
  def deleteTFoot(): Unit = js.native
  /**
    * Deletes the tHead element and its contents from the table.
    */
  def deleteTHead(): Unit = js.native
  /**
    * Creates a new row (tr) in the table, and adds the row to the rows collection.
    * @param index Number that specifies where to insert the row in the rows collection. The default value is -1, which appends the new row to the end of the rows collection.
    */
  def insertRow(): org.scalajs.dom.raw.HTMLTableRowElement = js.native
  def insertRow(index: Double): org.scalajs.dom.raw.HTMLTableRowElement = js.native
}

@JSGlobal("HTMLTableElement")
@js.native
object HTMLTableElement
  extends Instantiable0[org.scalajs.dom.raw.HTMLTableElement]

