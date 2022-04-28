<%@ page language="java" contentType="text/html; charset=UTF-8"
pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta charset="UTF-8" />
    <link rel="stylesheet" href="ressources/css/profile.css" />
    <link
      rel="icon"
      type="image/png"
      href="ressources/images/logo/title-logo.png"
    />
    <script src="ressources/scripts/profile.js" defer></script>
    <title>Profil</title>
  </head>
  <body>
    <section class="profile-header">
      <div class="main-banner-container">
		<%@include file="header.jsp"%>
        <div class="group-budget-display-container">
          <h2>Budget du groupe</h2>
          <div class="group-budget-amount-container">
            <img
              src="ressources/images/icons/profile-wallet-icon.png"
              alt="wallet-icon"
            />
            <p>1000€</p>
          </div>
        </div>

		<div class="profile-avatar-container">
			<input
			  type="file"
			  accept="image/png, image/jpg"
			  name="image"
			  id="avatar-input"
			  style="display: none"
			/>
		  <div id="avatar-container"></div>
		</div>
      </div>

      <div class="user-informations-container">
        <h1>Hanuman</h1>
        <h2>Nom du groupe</h2>
      </div>
    </section>

    <section class="user-options-card">
      <div class="option-container">
        <img
          src="ressources/images/icons/profile-spending-icon.png"
          alt="spending-icon"
        />
        <p>Mes dépenses</p>
      </div>

      <div class="option-container">
        <img
          src="ressources/images/icons/profile-group-icon.png"
          alt="group-icon"
        />
        <p>Mon groupe</p>
      </div>

      <div class="option-container">
        <img
          src="ressources/images/icons/profile-members-icon.png"
          alt="members-icon"
        />
        <p>les membres</p>
      </div>

      <div class="option-container">
        <img
          src="ressources/images/icons/profile-budget-icon.png"
          alt="budget-icon"
        />
        <p>Mon budget</p>
      </div>
    </section>

    <section class="grid-informations-container">
      <h2>Mon tableau de bord</h2>
      <div class="grid-container">
        <nav class="grid-nav-bar">
          <ul class="grid-nav-bar-buttons-list">
            <li><button class="user-budget-button">Mon budget</button></li>
            <li><button class="user-spending-button">Mes dépenses</button></li>
            <li><button class="group-budget-button">Budget groupe</button></li>
            <li>
              <button class="group-spending-button">Dépense groupe</button>
            </li>
          </ul>
        </nav>

        <div class="update-budget-container">
          <form action="#" method="POST">
            <label for="amount" >Combien souhaitez-vous ajouter à votre budget ?</label>
            <span>
              <input type="number" id="amount" />
              <p>€</p>
            </span>
            
            <input class="validation-button" type="submit" value="Valider" />
          </form>

          <div class="user-budget-container">
            <h2>Mon budget</h2>
            <p>40€</p>
          </div>
        </div>

        <div class="last-actions-dashboard-container">
          <div class="budget-actions-container">
            <h2>Mes opérations budget</h2>
            <table>
              <thead>
                <tr>
                  <th>Mon pseudo</th>
                  <th>Montant</th>
                  <th>Date</th>
                  <th>Actions</th>
                </tr>
              </thead>

              <tbody>
                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>

                <tr>
                  <td>Hanuman</td>
                  <td>20</td>
                  <td>22/04/2022</td>
                  <td>
                    <div class="table-actions-container">
                      <div class="table-actions-icon-container update-spending">
                        <img src="ressources/images/icons/profile-pen-icon.png" alt="pen-icon">
                      </div>
                      <div class="table-actions-icon-container delete-spending">
                        <img src="ressources/images/icons/profil-bin-icon.png" alt="bin-icon">
                      </div>
                    </div>
                  </td>
                </tr>
              </tbody>
            </table>
          </div>
        </div>     
      </div>
    </section>

    <div class="delete-account-button-container">
      <button>Supprimer le compte</button>
    </div>
  </body>
</html>
