package typingsSlinky.winrt.Windows.Storage.Search

import typingsSlinky.winrt.Windows.Foundation.Collections.IIterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IQueryOptionsFactory extends js.Object {
  def createCommonFileQuery(query: CommonFileQuery, fileTypeFilter: IIterable[String]): QueryOptions = js.native
  def createCommonFolderQuery(query: CommonFolderQuery): QueryOptions = js.native
}

object IQueryOptionsFactory {
  @scala.inline
  def apply(
    createCommonFileQuery: (CommonFileQuery, IIterable[String]) => QueryOptions,
    createCommonFolderQuery: CommonFolderQuery => QueryOptions
  ): IQueryOptionsFactory = {
    val __obj = js.Dynamic.literal(createCommonFileQuery = js.Any.fromFunction2(createCommonFileQuery), createCommonFolderQuery = js.Any.fromFunction1(createCommonFolderQuery))
    __obj.asInstanceOf[IQueryOptionsFactory]
  }
  @scala.inline
  implicit class IQueryOptionsFactoryOps[Self <: IQueryOptionsFactory] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withCreateCommonFileQuery(value: (CommonFileQuery, IIterable[String]) => QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommonFileQuery")(js.Any.fromFunction2(value))
        ret
    }
    @scala.inline
    def withCreateCommonFolderQuery(value: CommonFolderQuery => QueryOptions): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("createCommonFolderQuery")(js.Any.fromFunction1(value))
        ret
    }
  }
  
}

