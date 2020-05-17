package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object getQueriesForElementMod {
  type BoundFunctions[T] = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ P in keyof T ]: @testing-library/dom.@testing-library/dom/get-queries-for-element.BoundFunction<T[P]>}
    */ typingsSlinky.testingLibraryDom.testingLibraryDomStrings.BoundFunctions with org.scalablytyped.runtime.TopLevel[T]
  type Queries = org.scalablytyped.runtime.StringDictionary[typingsSlinky.testingLibraryDom.getQueriesForElementMod.Query]
  type Query = js.Function2[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* repeated */ js.Any, 
    js.Error | (js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement] | org.scalajs.dom.raw.HTMLElement]) | js.Array[org.scalajs.dom.raw.HTMLElement] | org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
}
