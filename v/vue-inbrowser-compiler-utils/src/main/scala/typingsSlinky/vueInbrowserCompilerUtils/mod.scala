package typingsSlinky.vueInbrowserCompilerUtils

import org.scalablytyped.runtime.StringDictionary
import typingsSlinky.vueInbrowserCompilerUtils.adaptCreateElementMod.CreateElementFunction
import typingsSlinky.vueInbrowserCompilerUtils.parseComponentMod.VsgSFCDescriptor
import typingsSlinky.vueInbrowserCompilerUtils.typesMod.ComponentDoc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("vue-inbrowser-compiler-utils", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  def adaptCreateElement(h: CreateElementFunction): CreateElementFunction = js.native
  
  def addScopedStyle(css: String, suffix: String): Unit = js.native
  
  def cleanName(name: String): String = js.native
  
  def concatenate(src: StringDictionary[js.Any], otherObj: StringDictionary[js.Any]*): StringDictionary[js.Any] = js.native
  
  def getDefaultExample(doc: ComponentDoc): String = js.native
  
  def isCodeVueSfc(code: String): Boolean = js.native
  
  def parseComponent(code: String): VsgSFCDescriptor = js.native
}
