package typingsSlinky.testingLibraryDom

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

package object queriesMod {
  type AllByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type AllByRole = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queriesMod.ByRoleOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type AllByText = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    js.Array[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindAllByBoundAttribute = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindAllByRole_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindAllByText_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[js.Array[org.scalajs.dom.raw.HTMLElement]]
  ]
  type FindByBoundAttribute = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindByRole_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queriesMod.ByRoleOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type FindByText_ = js.Function4[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    /* waitForElementOptions */ js.UndefOr[typingsSlinky.testingLibraryDom.waitForElementMod.WaitForElementOptions], 
    js.Promise[org.scalajs.dom.raw.HTMLElement]
  ]
  type GetByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type GetByRole_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queriesMod.ByRoleOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type GetByText_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    org.scalajs.dom.raw.HTMLElement
  ]
  type QueryByBoundAttribute = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.matchesMod.MatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  type QueryByRole_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* role */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queriesMod.ByRoleOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
  type QueryByText_ = js.Function3[
    /* container */ org.scalajs.dom.raw.HTMLElement, 
    /* id */ typingsSlinky.testingLibraryDom.matchesMod.Matcher, 
    /* options */ js.UndefOr[typingsSlinky.testingLibraryDom.queryHelpersMod.SelectorMatcherOptions], 
    org.scalajs.dom.raw.HTMLElement | scala.Null
  ]
}
