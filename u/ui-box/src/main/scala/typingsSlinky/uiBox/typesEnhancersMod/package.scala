package typingsSlinky.uiBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object typesEnhancersMod {
  type BoxCssProps[CP] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof CP ]: CP[P] | number | false | null | undefined}
    */ typingsSlinky.uiBox.uiBoxStrings.BoxCssProps with org.scalablytyped.runtime.TopLevel[CP]
  type PropAliases = org.scalablytyped.runtime.StringDictionary[js.Array[java.lang.String]]
  type PropEnhancers = org.scalablytyped.runtime.StringDictionary[
    js.Function1[
      /* value */ js.Any, 
      typingsSlinky.uiBox.typesEnhancersMod.EnhancedProp | scala.Null
    ]
  ]
  type PropTypesMapping = org.scalablytyped.runtime.StringDictionary[typingsSlinky.propTypes.mod.Validator[js.Any]]
  type PropValidators = org.scalablytyped.runtime.StringDictionary[js.Function1[/* value */ js.Any, js.UndefOr[java.lang.String]]]
}
