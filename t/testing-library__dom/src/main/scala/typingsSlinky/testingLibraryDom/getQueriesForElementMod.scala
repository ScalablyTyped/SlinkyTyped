package typingsSlinky.testingLibraryDom

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import org.scalajs.dom.raw.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@testing-library/dom/types/get-queries-for-element", JSImport.Namespace)
@js.native
object getQueriesForElementMod extends js.Object {
  
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement): BoundFunctions[T] = js.native
  def getQueriesForElement[T /* <: Queries */](element: HTMLElement, queriesToBind: T): BoundFunctions[T] = js.native
  
  type BoundFunction[T] = (js.Function2[/* text */ js.Any, js.UndefOr[js.Any], js.Any]) | (js.Function3[
    /* text */ js.Any, 
    /* options */ js.UndefOr[js.Any], 
    /* waitForElementOptions */ js.UndefOr[js.Any], 
    js.Any
  ])
  
  type BoundFunctions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @testing-library/dom.@testing-library/dom/types/get-queries-for-element.BoundFunction<T[P]>}
    */ typingsSlinky.testingLibraryDom.testingLibraryDomStrings.BoundFunctions with TopLevel[T]
  
  type Queries = StringDictionary[Query]
  
  type Query = js.Function2[
    /* container */ HTMLElement, 
    /* repeated */ js.Any, 
    js.Error | (js.Promise[js.Array[HTMLElement] | HTMLElement]) | js.Array[HTMLElement] | HTMLElement | Null
  ]
}
