package typingsSlinky.vegaLite

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

package object specBaseMod {
  
  @scala.inline
  def DEFAULT_SPACING: /* 20 */ scala.Double = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].selectDynamic("DEFAULT_SPACING").asInstanceOf[/* 20 */ scala.Double]
  
  type GenericCompositionLayoutWithColumns = typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayout with typingsSlinky.vegaLite.specBaseMod.ColumnMixins
  
  @scala.inline
  def extractCompositionLayout_concat(
    spec: typingsSlinky.vegaLite.specMod.NormalizedSpec,
    specType: typingsSlinky.vegaLite.vegaLiteStrings.concat,
    config: typingsSlinky.vegaLite.specBaseMod.CompositionConfigMixins
  ): typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns = (typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractCompositionLayout")(spec.asInstanceOf[js.Any], specType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns]
  
  @scala.inline
  def extractCompositionLayout_facet(
    spec: typingsSlinky.vegaLite.specMod.NormalizedSpec,
    specType: typingsSlinky.vegaLite.vegaLiteStrings.facet,
    config: typingsSlinky.vegaLite.specBaseMod.CompositionConfigMixins
  ): typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns = (typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("extractCompositionLayout")(spec.asInstanceOf[js.Any], specType.asInstanceOf[js.Any], config.asInstanceOf[js.Any])).asInstanceOf[typingsSlinky.vegaLite.specBaseMod.GenericCompositionLayoutWithColumns]
  
  @scala.inline
  def isFrameMixins(o: js.Any): /* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ scala.Boolean = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isFrameMixins")(o.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.FrameMixins<any> */ scala.Boolean]
  
  @scala.inline
  def isStep(size: scala.Double): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  @scala.inline
  def isStep(size: typingsSlinky.vegaLite.specBaseMod.Step): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  
  @scala.inline
  def isStep_container(size: typingsSlinky.vegaLite.vegaLiteStrings.container): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
  
  @scala.inline
  def isStep_merged(size: typingsSlinky.vegaLite.vegaLiteStrings.merged): /* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean = typingsSlinky.vegaLite.specBaseMod.^.asInstanceOf[js.Dynamic].applyDynamic("isStep")(size.asInstanceOf[js.Any]).asInstanceOf[/* is vega-lite.vega-lite/build/src/spec/base.Step */ scala.Boolean]
}
