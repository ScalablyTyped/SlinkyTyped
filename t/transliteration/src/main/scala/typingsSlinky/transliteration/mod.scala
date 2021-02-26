package typingsSlinky.transliteration

import typingsSlinky.transliteration.typesMod.SlugifyFunction
import typingsSlinky.transliteration.typesMod.TransliterateFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("transliteration", "slugify")
  @js.native
  val slugify: SlugifyFunction = js.native
  
  @JSImport("transliteration", "transliterate")
  @js.native
  val transliterate: TransliterateFunction = js.native
}
