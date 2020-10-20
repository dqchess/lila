package views.html.study

import play.api.i18n.Lang

import lila.app.templating.Environment._
import lila.i18n.{ I18nKeys => trans }

object jsI18n {

  def apply()(implicit lang: Lang) =
    views.html.board.userAnalysisI18n(withAdvantageChart = true) ++
      i18nJsObject(i18nKeys)

  val i18nKeys: List[lila.i18n.MessageKey] = {
    import trans.study._
    List(
      trans.name,
      trans.white,
      trans.black,
      trans.variant,
      trans.clearBoard,
      trans.startPosition,
      trans.cancel,
      trans.chat,
      addNewChapter,
      addMembers,
      inviteToTheStudy,
      pleaseOnlyInvitePeopleYouKnow,
      searchByUsername,
      spectator,
      contributor,
      kick,
      leaveTheStudy,
      youAreNowAContributor,
      youAreNowASpectator,
      pgnTags,
      like,
      newTag,
      commentThisPosition,
      commentThisMove,
      annotateWithGlyphs,
      theChapterIsTooShortToBeAnalysed,
      onlyContributorsCanRequestAnalysis,
      getAFullComputerAnalysis,
      makeSureTheChapterIsComplete,
      allSyncMembersRemainOnTheSamePosition,
      shareChanges,
      playing,
      first,
      previous,
      next,
      last,
      shareAndExport,
      cloneStudy,
      studyPgn,
      downloadAllGames,
      chapterPgn,
      downloadGame,
      studyUrl,
      broadcastUrl,
      currentChapterUrl,
      currentGameUrl,
      youCanPasteThisInTheForumToEmbed,
      startAtInitialPosition,
      startAtX,
      embedInYourWebsite,
      readMoreAboutEmbedding,
      onlyPublicStudiesCanBeEmbedded,
      open,
      xBroughtToYouByY,
      studyNotFound,
      editChapter,
      newChapter,
      orientation,
      analysisMode,
      pinnedChapterComment,
      saveChapter,
      clearAnnotations,
      deleteChapter,
      deleteThisChapter,
      clearAllCommentsInThisChapter,
      rightUnderTheBoard,
      noPinnedComment,
      normalAnalysis,
      hideNextMoves,
      interactiveLesson,
      chapterX,
      empty,
      startFromInitialPosition,
      editor,
      startFromCustomPosition,
      loadAGameByUrl,
      loadAPositionFromFen,
      loadAGameFromPgn,
      automatic,
      urlOfTheGame,
      loadAGameFromXOrY,
      createChapter,
      configureLiveBroadcast,
      createStudy,
      editStudy,
      visibility,
      public,
      `private`,
      unlisted,
      inviteOnly,
      allowCloning,
      nobody,
      onlyMe,
      contributors,
      members,
      everyone,
      enableSync,
      yesKeepEveryoneOnTheSamePosition,
      noLetPeopleBrowseFreely,
      pinnedStudyComment,
      start,
      save,
      clearChat,
      deleteTheStudyChatHistory,
      deleteStudy,
      deleteTheEntireStudy,
      whereDoYouWantToStudyThat,
      nbChapters,
      nbGames,
      nbMembers,
      pasteYourPgnTextHereUpToNbGames
    ).map(_.key)
  }
}
