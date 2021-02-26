package typingsSlinky.yamlFrontMatter

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typingsSlinky.jsYaml.mod.LoadOptions
import typingsSlinky.node.Buffer
import typingsSlinky.yamlFrontMatter.anon.ContentKeyName
import typingsSlinky.yamlFrontMatter.anon.Dictkey
import typingsSlinky.yamlFrontMatter.yamlFrontMatterStrings.loadFront
import typingsSlinky.yamlFrontMatter.yamlFrontMatterStrings.safeLoadFront
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront(content: String): Dictkey = js.native
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront(content: String, options: LoadOptions): Dictkey = js.native
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront(content: Buffer): Dictkey = js.native
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront(content: Buffer, options: LoadOptions): Dictkey = js.native
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with ContentKeyName[contentKeyName]): loadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  @JSImport("yaml-front-matter", "loadFront")
  @js.native
  def loadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with ContentKeyName[contentKeyName]): loadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront(content: String): Dictkey = js.native
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront(content: String, options: LoadOptions): Dictkey = js.native
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront(content: Buffer): Dictkey = js.native
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront(content: Buffer, options: LoadOptions): Dictkey = js.native
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: String, options: LoadOptions with ContentKeyName[contentKeyName]): safeLoadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
  @JSImport("yaml-front-matter", "safeLoadFront")
  @js.native
  def safeLoadFront_contentKeyName_String_Intersection[contentKeyName /* <: String */](content: Buffer, options: LoadOptions with ContentKeyName[contentKeyName]): safeLoadFront with TopLevel[js.Any] with StringDictionary[js.Any] = js.native
}
