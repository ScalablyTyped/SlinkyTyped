package typingsSlinky.semanticUiReact.gridRowMod

import org.scalablytyped.runtime.StringDictionary
import slinky.core.TagMod
import typingsSlinky.semanticUiReact.genericMod.SemanticCOLORS
import typingsSlinky.semanticUiReact.genericMod.SemanticTEXTALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticVERTICALALIGNMENTS
import typingsSlinky.semanticUiReact.genericMod.SemanticWIDTHS
import typingsSlinky.semanticUiReact.gridColumnMod.GridOnlyProp
import typingsSlinky.semanticUiReact.gridGridMod.GridReversedProp
import typingsSlinky.semanticUiReact.semanticUiReactStrings.equal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GridRowProps
  extends StrictGridRowProps
     with /* key */ StringDictionary[js.Any]

object GridRowProps {
  @scala.inline
  def apply(
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    as: js.Any = null,
    centered: js.UndefOr[Boolean] = js.undefined,
    children: TagMod[Any] = null,
    className: String = null,
    color: SemanticCOLORS = null,
    columns: SemanticWIDTHS | equal = null,
    divided: js.UndefOr[Boolean] = js.undefined,
    only: GridOnlyProp = null,
    reversed: GridReversedProp = null,
    stretched: js.UndefOr[Boolean] = js.undefined,
    textAlign: SemanticTEXTALIGNMENTS = null,
    verticalAlign: SemanticVERTICALALIGNMENTS = null
  ): GridRowProps = {
    val __obj = js.Dynamic.literal()
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (as != null) __obj.updateDynamic("as")(as.asInstanceOf[js.Any])
    if (!js.isUndefined(centered)) __obj.updateDynamic("centered")(centered.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (className != null) __obj.updateDynamic("className")(className.asInstanceOf[js.Any])
    if (color != null) __obj.updateDynamic("color")(color.asInstanceOf[js.Any])
    if (columns != null) __obj.updateDynamic("columns")(columns.asInstanceOf[js.Any])
    if (!js.isUndefined(divided)) __obj.updateDynamic("divided")(divided.asInstanceOf[js.Any])
    if (only != null) __obj.updateDynamic("only")(only.asInstanceOf[js.Any])
    if (reversed != null) __obj.updateDynamic("reversed")(reversed.asInstanceOf[js.Any])
    if (!js.isUndefined(stretched)) __obj.updateDynamic("stretched")(stretched.asInstanceOf[js.Any])
    if (textAlign != null) __obj.updateDynamic("textAlign")(textAlign.asInstanceOf[js.Any])
    if (verticalAlign != null) __obj.updateDynamic("verticalAlign")(verticalAlign.asInstanceOf[js.Any])
    __obj.asInstanceOf[GridRowProps]
  }
}

