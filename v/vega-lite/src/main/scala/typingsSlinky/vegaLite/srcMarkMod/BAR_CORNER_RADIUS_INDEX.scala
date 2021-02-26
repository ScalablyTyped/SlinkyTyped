package typingsSlinky.vegaLite.srcMarkMod

import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusBottomLeft
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusBottomRight
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusTopLeft
import typingsSlinky.vegaLite.vegaLiteStrings.cornerRadiusTopRight
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<std.Record<vega.vega.Orientation, std.Array<'cornerRadiusTopLeft' | 'cornerRadiusTopRight' | 'cornerRadiusBottomLeft' | 'cornerRadiusBottomRight'>>> */
object BAR_CORNER_RADIUS_INDEX {
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX")
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX.horizontal")
  @js.native
  def horizontal: js.UndefOr[
    js.Array[
      cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
    ]
  ] = js.native
  @scala.inline
  def horizontal_=(
    x: js.UndefOr[
      js.Array[
        cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("horizontal")(x.asInstanceOf[js.Any])
  
  @JSImport("vega-lite/build/src/mark", "BAR_CORNER_RADIUS_INDEX.vertical")
  @js.native
  def vertical: js.UndefOr[
    js.Array[
      cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
    ]
  ] = js.native
  @scala.inline
  def vertical_=(
    x: js.UndefOr[
      js.Array[
        cornerRadiusTopLeft | cornerRadiusTopRight | cornerRadiusBottomLeft | cornerRadiusBottomRight
      ]
    ]
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("vertical")(x.asInstanceOf[js.Any])
}
