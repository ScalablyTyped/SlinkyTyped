package typingsSlinky.typesettable

import typingsSlinky.typesettable.buildSrcContextsMod.IRulerFactoryContext
import typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.IDimensions
import typingsSlinky.typesettable.buildSrcMeasurersAbstractMeasurerMod.IRuler
import typingsSlinky.typesettable.buildSrcMeasurersCharacterMeasurerMod.CharacterMeasurer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("typesettable/build/src/measurers/cacheCharacterMeasurer", JSImport.Namespace)
@js.native
object buildSrcMeasurersCacheCharacterMeasurerMod extends js.Object {
  @js.native
  class CacheCharacterMeasurer protected () extends CharacterMeasurer {
    def this(ruler: IRulerFactoryContext) = this()
    def this(ruler: IRuler) = this()
    def this(ruler: IRulerFactoryContext, useGuards: Boolean) = this()
    def this(ruler: IRuler, useGuards: Boolean) = this()
    var cache: js.Any = js.native
    def _measureCharacterNotFromCache(c: String): IDimensions = js.native
    def reset(): Unit = js.native
  }
  
}

