package typingsSlinky.texzilla

import org.scalajs.dom.raw.DOMParser
import org.scalajs.dom.raw.Document
import org.scalajs.dom.raw.Element
import org.scalajs.dom.raw.HTMLImageElement
import org.scalajs.dom.raw.XMLSerializer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("texzilla", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def filterElement(el: Element): Unit = js.native
  def filterElement(el: Element, throwOnError: Boolean): Unit = js.native
  
  def filterString(str: String): String = js.native
  def filterString(str: String, throwOnError: Boolean): String = js.native
  
  def getTeXSource(el: String): String | Null = js.native
  def getTeXSource(el: Element): String | Null = js.native
  
  def setDOMParser(parser: DOMParser): Unit = js.native
  
  def setItexIdentifierMode(enabled: Boolean): Unit = js.native
  
  def setSafeMode(enabled: Boolean): Unit = js.native
  
  def setXMLSerializer(serializer: XMLSerializer): Unit = js.native
  
  def toImage(str: String): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double
  ): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: js.UndefOr[scala.Nothing], roundToPowerOfTwo: Boolean): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: Boolean,
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: js.UndefOr[scala.Nothing], roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: js.UndefOr[scala.Nothing],
    roundToPowerOfTwo: Boolean,
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: Boolean): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: js.UndefOr[scala.Nothing], size: Double): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: js.UndefOr[scala.Nothing],
    size: Double,
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean): HTMLImageElement = js.native
  def toImage(
    str: String,
    rightToLeft: Boolean,
    roundToPowerOfTwo: Boolean,
    size: js.UndefOr[scala.Nothing],
    document: Document
  ): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double): HTMLImageElement = js.native
  def toImage(str: String, rightToLeft: Boolean, roundToPowerOfTwo: Boolean, size: Double, document: Document): HTMLImageElement = js.native
  
  def toMathML(str: String): Element = js.native
  def toMathML(
    str: String,
    displayMode: js.UndefOr[scala.Nothing],
    rightToLeft: js.UndefOr[scala.Nothing],
    throwOnError: Boolean
  ): Element = js.native
  def toMathML(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean): Element = js.native
  def toMathML(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean, throwOnError: Boolean): Element = js.native
  def toMathML(str: String, displayMode: Boolean): Element = js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: js.UndefOr[scala.Nothing], throwOnError: Boolean): Element = js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean): Element = js.native
  def toMathML(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): Element = js.native
  
  def toMathMLString(str: String): String = js.native
  def toMathMLString(
    str: String,
    displayMode: js.UndefOr[scala.Nothing],
    rightToLeft: js.UndefOr[scala.Nothing],
    throwOnError: Boolean
  ): String = js.native
  def toMathMLString(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean): String = js.native
  def toMathMLString(str: String, displayMode: js.UndefOr[scala.Nothing], rightToLeft: Boolean, throwOnError: Boolean): String = js.native
  def toMathMLString(str: String, displayMode: Boolean): String = js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: js.UndefOr[scala.Nothing], throwOnError: Boolean): String = js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean): String = js.native
  def toMathMLString(str: String, displayMode: Boolean, rightToLeft: Boolean, throwOnError: Boolean): String = js.native
}
