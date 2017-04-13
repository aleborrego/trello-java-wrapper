package com.julienvey.trello;

import java.util.List;

import com.julienvey.trello.domain.Action;
import com.julienvey.trello.domain.Argument;
import com.julienvey.trello.domain.Attachment;
import com.julienvey.trello.domain.Board;
import com.julienvey.trello.domain.Card;
import com.julienvey.trello.domain.CardWithActions;
import com.julienvey.trello.domain.CheckItem;
import com.julienvey.trello.domain.CheckList;
import com.julienvey.trello.domain.Entity;
import com.julienvey.trello.domain.Member;
import com.julienvey.trello.domain.MyPrefs;
import com.julienvey.trello.domain.Organization;
import com.julienvey.trello.domain.TList;

public interface Trello {

	/* Board */
	Board getBoard(String boardId, Argument... args);

	List<Action> getBoardActions(String boardId, Argument... args);

	List<Card> getBoardCards(String boardId, Argument... args);

	Card getBoardCard(String boardId, String cardId, Argument... args);

	List<CheckList> getBoardChecklists(String boardId, Argument... args);

	List<TList> getBoardLists(String boardId, Argument... args);

	List<Member> getBoardMembers(String boardId, Argument... args);

	List<Card> getBoardMemberCards(String boardId, String memberId, Argument... args);

	// FIXME Remove this method
	@Deprecated
	List<CardWithActions> getBoardMemberActivity(String boardId, String memberId, String actionsFilter,
			Argument... args);

	List<Member> getBoardMembersInvited(String boardId, Argument... args);

	MyPrefs getBoardMyPrefs(String boardId);

	Organization getBoardOrganization(String boardId, Argument... args);

	/* Actions */

	Action getAction(String actionId, Argument... args);

	Board getActionBoard(String actionId, Argument... args);

	Card getActionCard(String actionId, Argument... args);

	List<Entity> getActionEntities(String actionId);

	TList getActionList(String actionId, Argument... args);

	Member getActionMember(String actionId, Argument... args);

	Member getActionMemberCreator(String actionId, Argument... args);

	Organization getActionOrganization(String actionId, Argument... args);

	/* Cards */

	Card getCard(String cardId, Argument... args);

	List<Action> getCardActions(String cardId, Argument... args);

	List<Attachment> getCardAttachments(String cardId, Argument... args);

	Attachment getCardAttachment(String cardId, String attachmentId, Argument... args);

	Board getCardBoard(String cardId, Argument... args);

	/* Lists */

	TList getList(String listId, Argument... args);
	
	List<Card> getListCards(String listId, Argument... args);

	/* CheckLists */

	CheckList getCheckList(String checkListId, Argument... args);

	CheckList createCheckList(String cardId, CheckList checkList);

	void createCheckItem(String checkListId, CheckItem checkItem);

	/////////////////

	Card createCard(String listId, Card card);

	void addLabelsToCard(String idCard, String[] labels);

	void addCommentToCard(String idCard, String comment);

	Card updateCard(Card card);

	// FIXME Remove this method
	@Deprecated
	Member getBasicMemberInformation(String username);

	Member getMemberInformation(String username);

	/* Organizations */
	List<Member> getOrganizationMembers(String organizationId, Argument... args);

}
