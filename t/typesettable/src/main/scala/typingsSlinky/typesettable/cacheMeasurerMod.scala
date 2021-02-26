package typingsSlinky.typesettable

import typingsSlinky.typesettable.abstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.abstractMeasurerMod.IRuler
import typingsSlinky.typesettable.cacheCharacterMeasurerMod.CacheCharacterMeasurer
import typingsSlinky.typesettable.contextsMod.IRulerFactoryContext
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMeasurerMod {
  
  @JSImport("typesettable/build/src/measurers/cacheMeasurer", "CacheMeasurer")
  @js.native
  class CacheMeasurer protected () extends CacheCharacterMeasurer {
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext) = this()
    
    def _measureNotFromCache(s: String): IDimensions = js.native
    
    var dimCache: js.Any = js.native
  }
}
