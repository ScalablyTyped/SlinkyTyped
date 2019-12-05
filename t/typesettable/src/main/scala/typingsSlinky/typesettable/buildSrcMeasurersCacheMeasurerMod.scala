package typingsSlinky.typesettable

import typingsSlinky.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typingsSlinky.typesettable.buildSrcMeasurersCacheCharacterMeasurerMod.CacheCharacterMeasurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheMeasurer", JSImport.Namespace)
@js.native
object buildSrcMeasurersCacheMeasurerMod extends js.Object {
  @js.native
  class CacheMeasurer protected () extends CacheCharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    var dimCache: js.Any = js.native
    def _measureNotFromCache(s: String): IDimensions = js.native
  }
  
}

