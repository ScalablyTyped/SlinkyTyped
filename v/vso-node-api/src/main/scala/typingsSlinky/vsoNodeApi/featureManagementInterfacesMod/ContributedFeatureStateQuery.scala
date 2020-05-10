package typingsSlinky.vsoNodeApi.featureManagementInterfacesMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ContributedFeatureStateQuery extends js.Object {
  /**
    * The list of feature ids to query
    */
  var featureIds: js.Array[String] = js.native
  /**
    * The query result containing the current feature states for each of the queried feature ids
    */
  var featureStates: StringDictionary[ContributedFeatureState] = js.native
  /**
    * A dictionary of scope values (project name, etc.) to use in the query (if querying across scopes)
    */
  var scopeValues: StringDictionary[String] = js.native
}

object ContributedFeatureStateQuery {
  @scala.inline
  def apply(
    featureIds: js.Array[String],
    featureStates: StringDictionary[ContributedFeatureState],
    scopeValues: StringDictionary[String]
  ): ContributedFeatureStateQuery = {
    val __obj = js.Dynamic.literal(featureIds = featureIds.asInstanceOf[js.Any], featureStates = featureStates.asInstanceOf[js.Any], scopeValues = scopeValues.asInstanceOf[js.Any])
    __obj.asInstanceOf[ContributedFeatureStateQuery]
  }
  @scala.inline
  implicit class ContributedFeatureStateQueryOps[Self <: ContributedFeatureStateQuery] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def withFeatureIds(value: js.Array[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureIds")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withFeatureStates(value: StringDictionary[ContributedFeatureState]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("featureStates")(value.asInstanceOf[js.Any])
        ret
    }
    @scala.inline
    def withScopeValues(value: StringDictionary[String]): Self = {
        val ret = this.duplicate
        ret.asInstanceOf[js.Dynamic].updateDynamic("scopeValues")(value.asInstanceOf[js.Any])
        ret
    }
  }
  
}

