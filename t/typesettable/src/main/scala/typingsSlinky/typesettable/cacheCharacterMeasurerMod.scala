package typingsSlinky.typesettable

import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.abstractMeasurerMod.IRuler
import typingsSlinky.typesettable.characterMeasurerMod.CharacterMeasurer
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheCharacterMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", "CacheCharacterMeasurer")
  @js.native
  class CacheCharacterMeasurer protected () extends CharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    
    def _measureCharacterNotFromCache(c: String): IDimensions = js.native
    
    var cache: js.Any = js.native
    
    def reset(): Unit = js.native
  }
}
