package typingsSlinky.wordpressComponents.queryControlsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object QueryControls {
  type CategoryProps = typingsSlinky.wordpressComponents.anon.CategoriesList | js.Object
  type NumberProps = typingsSlinky.wordpressComponents.anon.MaxItems | js.Object
  type OrderProps = typingsSlinky.wordpressComponents.anon.OnOrderByChange | js.Object
  type Props = typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.CategoryProps with typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.OrderProps with typingsSlinky.wordpressComponents.queryControlsMod.QueryControls.NumberProps
}
