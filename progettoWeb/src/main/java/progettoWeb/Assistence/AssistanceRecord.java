package progettoWeb.Assistence;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import progettoWeb.Chat.ChatRecord;
import progettoWeb.User.UserRecord;

@Entity
public class AssistanceRecord {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    @ManyToOne(targetEntity = UserRecord.class)
    @JoinColumn(nullable = false, name = "staff")
    private UserRecord staff;

    @ManyToOne
    @JoinColumn(name = "chat_id")
    @JsonIgnore
    private ChatRecord chat;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public UserRecord getStaff() {
        return staff;
    }

    public void setStaff(UserRecord staff) {
        this.staff = staff;
    }

    public ChatRecord getChat() {
        return chat;
    }

    public void setChat(ChatRecord chat) {
        this.chat = chat;
    }
}
