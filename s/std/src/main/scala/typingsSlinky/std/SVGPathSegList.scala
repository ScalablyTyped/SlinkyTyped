package typingsSlinky.std

import org.scalablytyped.runtime.Instantiable0
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SVGPathSegList extends js.Object {
  val numberOfItems: Double
  def appendItem(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg
  def clear(): Unit
  def getItem(index: Double): org.scalajs.dom.raw.SVGPathSeg
  def initialize(newItem: org.scalajs.dom.raw.SVGPathSeg): org.scalajs.dom.raw.SVGPathSeg
  def insertItemBefore(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg
  def removeItem(index: Double): org.scalajs.dom.raw.SVGPathSeg
  def replaceItem(newItem: org.scalajs.dom.raw.SVGPathSeg, index: Double): org.scalajs.dom.raw.SVGPathSeg
}

@JSGlobal("SVGPathSegList")
@js.native
object SVGPathSegList extends Instantiable0[SVGPathSegList]

