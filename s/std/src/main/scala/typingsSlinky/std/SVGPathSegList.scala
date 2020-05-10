package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SVGPathSegList extends js.Object {
  val numberOfItems: Double = js.native
  def appendItem(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  def clear(): Unit = js.native
  def getItem(index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def initialize(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg = js.native
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def removeItem(index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
  def replaceItem(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg = js.native
}

@JSGlobal("SVGPathSegList")
@js.native
object SVGPathSegList
  extends Instantiable0[org.scalajs.dom.raw.SVGPathSegList]

