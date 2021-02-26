package typingsSlinky.vexdb

import typingsSlinky.vexdb.requestObjectsMod.AwardsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.EventsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.MatchesRequestObject
import typingsSlinky.vexdb.requestObjectsMod.RankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SeasonRankingsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.SkillsRequestObject
import typingsSlinky.vexdb.requestObjectsMod.TeamsRequestObject
import typingsSlinky.vexdb.responseObjectsMod.AwardsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.EventsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.MatchesResponseObject
import typingsSlinky.vexdb.responseObjectsMod.RankingsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.SeasonRankingsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.SkillsResponseObject
import typingsSlinky.vexdb.responseObjectsMod.TeamsResponseObject
import typingsSlinky.vexdb.vexdbNumbers.`0`
import typingsSlinky.vexdb.vexdbNumbers.`1`
import typingsSlinky.vexdb.vexdbStrings.awards
import typingsSlinky.vexdb.vexdbStrings.events
import typingsSlinky.vexdb.vexdbStrings.matches
import typingsSlinky.vexdb.vexdbStrings.rankings
import typingsSlinky.vexdb.vexdbStrings.season_rankings
import typingsSlinky.vexdb.vexdbStrings.skills
import typingsSlinky.vexdb.vexdbStrings.teams
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object cacheMod {
  
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_awards(endpoint: awards, params: AwardsRequestObject): js.Promise[APIResponse[AwardsRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_events(endpoint: events, params: EventsRequestObject): js.Promise[APIResponse[EventsRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_matches(endpoint: matches, params: MatchesRequestObject): js.Promise[APIResponse[MatchesRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_rankings(endpoint: rankings, params: RankingsRequestObject): js.Promise[APIResponse[RankingsRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_seasonrankings(endpoint: season_rankings, params: SeasonRankingsRequestObject): js.Promise[APIResponse[SeasonRankingsRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_skills(endpoint: skills, params: SkillsRequestObject): js.Promise[APIResponse[SkillsRequestObject]] = js.native
  @JSImport("vexdb/out/methods/cache", "resolve")
  @js.native
  def resolve_teams(endpoint: teams, params: TeamsRequestObject): js.Promise[APIResponse[TeamsRequestObject]] = js.native
  
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_awards(endpoint: awards, params: AwardsRequestObject, data: APIResponse[AwardsResponseObject]): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_events(endpoint: events, params: EventsRequestObject, data: APIResponse[EventsResponseObject]): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_matches(endpoint: matches, params: MatchesRequestObject, data: APIResponse[MatchesResponseObject]): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_rankings(endpoint: rankings, params: RankingsRequestObject, data: APIResponse[RankingsResponseObject]): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_seasonrankings(
    endpoint: season_rankings,
    params: SeasonRankingsRequestObject,
    data: APIResponse[SeasonRankingsResponseObject]
  ): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_skills(endpoint: skills, params: SkillsRequestObject, data: APIResponse[SkillsResponseObject]): js.Promise[Boolean] = js.native
  @JSImport("vexdb/out/methods/cache", "store")
  @js.native
  def store_teams(endpoint: teams, params: TeamsRequestObject, data: APIResponse[TeamsResponseObject]): js.Promise[Boolean] = js.native
  
  @js.native
  trait APIFailure[T] extends APIResponse[T] {
    
    var error_code: Double = js.native
    
    var error_text: String = js.native
    
    var status: `0` = js.native
  }
  object APIFailure {
    
    @scala.inline
    def apply[T](error_code: Double, error_text: String, status: `0`): APIFailure[T] = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APIFailure[T]]
    }
    
    @scala.inline
    implicit class APIFailureMutableBuilder[Self <: APIFailure[_], T] (val x: Self with APIFailure[T]) extends AnyVal {
      
      @scala.inline
      def setError_code(value: Double): Self = StObject.set(x, "error_code", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setError_text(value: String): Self = StObject.set(x, "error_text", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `0`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typingsSlinky.vexdb.cacheMod.APISuccess[T]
    - typingsSlinky.vexdb.cacheMod.APIFailure[T]
  */
  trait APIResponse[T] extends StObject
  object APIResponse {
    
    @scala.inline
    def APIFailure[T](error_code: Double, error_text: String, status: `0`): typingsSlinky.vexdb.cacheMod.APIFailure[T] = {
      val __obj = js.Dynamic.literal(error_code = error_code.asInstanceOf[js.Any], error_text = error_text.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vexdb.cacheMod.APIFailure[T]]
    }
    
    @scala.inline
    def APISuccess[T](result: js.Array[T], size: Double, status: `1`): typingsSlinky.vexdb.cacheMod.APISuccess[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[typingsSlinky.vexdb.cacheMod.APISuccess[T]]
    }
  }
  
  @js.native
  trait APISuccess[T] extends APIResponse[T] {
    
    var result: js.Array[T] = js.native
    
    var size: Double = js.native
    
    var status: `1` = js.native
  }
  object APISuccess {
    
    @scala.inline
    def apply[T](result: js.Array[T], size: Double, status: `1`): APISuccess[T] = {
      val __obj = js.Dynamic.literal(result = result.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any], status = status.asInstanceOf[js.Any])
      __obj.asInstanceOf[APISuccess[T]]
    }
    
    @scala.inline
    implicit class APISuccessMutableBuilder[Self <: APISuccess[_], T] (val x: Self with APISuccess[T]) extends AnyVal {
      
      @scala.inline
      def setResult(value: js.Array[T]): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResultVarargs(value: T*): Self = StObject.set(x, "result", js.Array(value :_*))
      
      @scala.inline
      def setSize(value: Double): Self = StObject.set(x, "size", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStatus(value: `1`): Self = StObject.set(x, "status", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait CacheEntry[T] extends StObject {
    
    var expires: Double = js.native
    
    var value: APIResponse[T] = js.native
  }
  object CacheEntry {
    
    @scala.inline
    def apply[T](expires: Double, value: APIResponse[T]): CacheEntry[T] = {
      val __obj = js.Dynamic.literal(expires = expires.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CacheEntry[T]]
    }
    
    @scala.inline
    implicit class CacheEntryMutableBuilder[Self <: CacheEntry[_], T] (val x: Self with CacheEntry[T]) extends AnyVal {
      
      @scala.inline
      def setExpires(value: Double): Self = StObject.set(x, "expires", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setValue(value: APIResponse[T]): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
}
