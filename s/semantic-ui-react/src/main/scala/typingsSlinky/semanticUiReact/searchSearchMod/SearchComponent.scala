package typingsSlinky.semanticUiReact.searchSearchMod

import slinky.core.ReactComponentClass
import typingsSlinky.react.mod.ComponentClass
import typingsSlinky.semanticUiReact.searchCategoryMod.SearchCategoryProps
import typingsSlinky.semanticUiReact.searchResultMod.SearchResultProps
import typingsSlinky.semanticUiReact.searchResultsMod.SearchResultsProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SearchComponent
  extends ComponentClass[SearchProps, js.Object] {
  var Category: ReactComponentClass[SearchCategoryProps] = js.native
  var Result: ReactComponentClass[SearchResultProps] = js.native
  var Results: ReactComponentClass[SearchResultsProps] = js.native
}

