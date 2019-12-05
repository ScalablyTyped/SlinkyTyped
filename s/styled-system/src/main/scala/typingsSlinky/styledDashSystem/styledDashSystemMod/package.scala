package typingsSlinky.styledDashSystem

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object styledDashSystemMod {
  import org.scalablytyped.runtime.StringDictionary
  import typingsSlinky.std.Pick
  import typingsSlinky.styledDashSystem.styledDashSystemNumbers.`0`
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.m
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.mb
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.ml
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.mr
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.mt
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.mx
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.my
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.p
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.pb
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.pl
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.pr
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.pt
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.px
  import typingsSlinky.styledDashSystem.styledDashSystemStrings.py

  type Config = /** Property name exposed for use in components */
  StringDictionary[ConfigStyle | Boolean]
  type MarginBottomProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mb | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginBottom
  ]
  type MarginLeftProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    ml | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginLeft
  ]
  type MarginProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    m | typingsSlinky.styledDashSystem.styledDashSystemStrings.margin | mt | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginTop | mb | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginBottom | ml | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginLeft | mr | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginRight | my | mx
  ]
  type MarginRightProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mr | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginRight
  ]
  type MarginTopProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    mt | typingsSlinky.styledDashSystem.styledDashSystemStrings.marginTop
  ]
  type ObjectOrArray[T] = js.Array[T] | (StringDictionary[
    T | (/* import warning: SimplifyRecursiveTypeAlias.enterTsTypeRef rewrittenOpt $anonfun#applyOrElse Simplified recursive type alias styled-system.styled-system.ObjectOrArray<T> */ js.Object)
  ])
  type PaddingBottomProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pb | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingBottom
  ]
  type PaddingLeftProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pl | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingLeft
  ]
  type PaddingProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    p | typingsSlinky.styledDashSystem.styledDashSystemStrings.padding | pt | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingTop | pb | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingBottom | pl | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingLeft | pr | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingRight | py | px
  ]
  type PaddingRightProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pr | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingRight
  ]
  type PaddingTopProps = Pick[
    SpaceProps[TLengthStyledSystem], 
    pt | typingsSlinky.styledDashSystem.styledDashSystemStrings.paddingTop
  ]
  type ResponsiveValue[T] = T | (js.Array[T | Null]) | StringDictionary[T]
  type Scale = ObjectOrArray[Double | String]
  type TLengthStyledSystem = String | `0` | Double
}
