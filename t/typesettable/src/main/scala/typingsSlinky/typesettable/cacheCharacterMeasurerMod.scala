package typingsSlinky.typesettable

import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.abstractMeasurerMod.IRuler
import typingsSlinky.typesettable.characterMeasurerMod.CharacterMeasurer
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", JSImport.Namespace)
@js.native
object cacheCharacterMeasurerMod extends js.Object {
  
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
